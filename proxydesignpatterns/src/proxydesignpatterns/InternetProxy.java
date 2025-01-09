/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxydesignpatterns;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author NooR
 */
public class InternetProxy implements InternetSerivceProvider{

    private List<String> blockedSites = Arrays.asList("twitter","youtube","facebook");
    @Override
    public String serveSite(String url) {
        internetlog(url);
        if(blockedSites.contains(url)){
            return "This website is blocked!!";
        }
        return new We().serveSite(url);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void internetlog (String url){
        System.out.println("[" + System.currentTimeMillis()+ "]"+ "->" + url + " is requested \n");
    }
    
}
