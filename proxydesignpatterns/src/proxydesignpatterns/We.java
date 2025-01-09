/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxydesignpatterns;

/**
 *
 * @author NooR
 */
public class We implements InternetSerivceProvider {

    @Override
    public String serveSite(String url) {

        return String.format("https://www.%s.com",url);



    }
    
}
