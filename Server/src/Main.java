import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try
		{
			new ConnectionServer();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
