package scrapy;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lang on 2015/10/3.
 */
public class Login {

    public static int logIn(){
        HttpClient httpClient = new DefaultHttpClient();
        Header[] allHeader;
        HttpGet httpGet = new HttpGet("http://study.163.com/");
        HttpPost httpPost = new HttpPost("https://reg.163.com/logins.jsp");
        httpPost.setHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        httpPost.setHeader("Accept-Encoding","gzip, deflate");
        httpPost.setHeader("Accept-Language","zh-CN,zh;q=0.8");
        httpPost.setHeader("Cache-Control","max-age=0");
        httpPost.setHeader("Connection","keep-alive");
        httpPost.setHeader("Content-Type","application/x-www-form-urlencoded");
        httpPost.setHeader("Cookie","SID=7e79ef0b-7e4a-4222-a1af-13e842c13457; JSESSIONID=abc--pCEBtMKMfGw4STav; vjuids=1683988a.14f6e13ecd5.0.fbee16f1; _ntes_nnid=c0d58af20fca58a574d4d28d52634c51,1440660843905; usertrack=c+5+hlXevafDHn/qBxRyAg==; _ntes_nuid=c0d58af20fca58a574d4d28d52634c51; vjlast=1440660844.1443857506.11; vinfo_n_f_l_n3=32933cbf0e47702b.1.1.1440660843914.1441348062591.1443860072645");
        httpPost.setHeader("DNT","1");
        httpPost.setHeader("Host","reg.163.com");
        httpPost.setHeader("Origin","http://study.163.com");
        httpPost.setHeader("Referer","http://study.163.com/");
        httpPost.setHeader("User-Agent","Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 BIDUBrowser/7.6 Safari/537.36");
        httpPost.setHeader("X-DevTools-Emulate-Network-Conditions-Client-Id","FC0725A4-14BA-4C0E-A86C-0F4491FFA37F");
        List<NameValuePair> nameValuePairList = new ArrayList<NameValuePair>();
        nameValuePairList.add(new BasicNameValuePair("product","study"));
        nameValuePairList.add(new BasicNameValuePair("url","http://study.163.com/?from=study"));
        nameValuePairList.add(new BasicNameValuePair("savelogin","1"));
        nameValuePairList.add(new BasicNameValuePair("domains","163.com"));
        nameValuePairList.add(new BasicNameValuePair("type","0"));
        nameValuePairList.add(new BasicNameValuePair("append","1"));
        nameValuePairList.add(new BasicNameValuePair("username","langzeyu123@gmail.com"));
        nameValuePairList.add(new BasicNameValuePair("password","Lang1024@"));
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairList));
            HttpResponse httpResponse = httpClient.execute(httpPost);
            return  httpResponse.getStatusLine().getStatusCode();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static void main(String[] args){
        int i = logIn();
        System.out.println(i);
    }

}

