/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acceptance;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Awesomeness
 */
public class WebServiceAcceptanceTest {
    
    public WebServiceAcceptanceTest(){
    }
    
    @Test
    public void serverReturnsCorrectStatusCode() throws IOException{
        
        HttpServer server = HttpServer.create();
        
        
    
    }
    
}
