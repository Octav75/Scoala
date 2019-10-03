package networking.getpage;

import java.io.*;
import java.net.*;

public class GetPage
{
  public static int BUFFER_SIZE = 8192;

  public String downloadPage(URL url) throws IOException
  {
    StringBuilder result = new StringBuilder();
    byte buffer[] = new byte[BUFFER_SIZE];

    InputStream s = url.openStream();
    int size = 0;

    do
    {
      size = s.read(buffer);
      if (size != -1)
        result.append(new String(buffer, 0, size));
    } while (size != -1);

    return result.toString();
  }

  public void execute(String page)
  {
    try
    {
      URL u = new URL(page);
      String str = downloadPage(u);
      System.out.println(str);

    } catch (MalformedURLException e)
    {
      e.printStackTrace();
    } catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  public static void main(String args[])
  {
    GetPage page = new GetPage();
    String url = "http://www.google.com";
    page.execute(url);
  }
}
