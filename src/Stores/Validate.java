/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author shashi
 */
public class Validate {
    public static boolean checkLength(String title){
        if(title.length()>0){
        return true;
        }else{
            return false;
        }
    }
    public static boolean validateEmail(String email) {                 

                        
       boolean status=false;    
       String EMAIL_PATTERN = 
  "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
  + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
       Pattern pattern = Pattern.compile(EMAIL_PATTERN);
       Matcher matcher=pattern.matcher(email);
       if(matcher.matches())
       {
           status=true;
       }
       else{
           status=false;
       }
           return status;
            
    }//email regex
    public static boolean phoneNo(String title){
        if(title.length()>12){
        return true;
        }else{
            return false;
        }
    }
    public static boolean stringLengthy(String title){
        if(title.length()<3){
        return true;
        }else{
            return false;
        }
    }
        
    }

