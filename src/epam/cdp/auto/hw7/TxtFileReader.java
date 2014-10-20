package epam.cdp.auto.hw7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TxtFileReader extends AbstractReader{
	
	protected String fullPath;
	
	public TxtFileReader (String fullPath) {
		
		super();
		this.fullPath = fullPath;
	}
	
	public String getFullPath() {
		return fullPath;
	}
	
	@Override
	public Sweets readInfo (int price) {
		
		File f = new File(getFullPath());
		BufferedReader br = null;
		String str = null;
		Sweets sweet = null;
		
		try {
			br = new BufferedReader(new FileReader(f));
			
			while((str = br.readLine())!=null) {
				String[] info = str.split(":");
				if(Integer.parseInt(info[1]) == price) {
					sweet = new Sweets( info[0], Integer.parseInt(info[1]), Integer.parseInt(info[2]), info[3]);
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try{
				if(br!=null){
					br.close();
				}
			} catch(IOException e){
				System.out.println(e.getMessage());
			}
		}
		
		return sweet;
		
	}

}
