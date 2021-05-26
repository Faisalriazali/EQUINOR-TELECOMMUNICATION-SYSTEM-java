/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telephoneconnection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author M-Umer
 */
public class Validation {
    
    public boolean valid(String pat,String mat)
    {
        Pattern p=Pattern.compile(pat);
        Matcher m=p.matcher(mat);
        
        if(!m.matches())
        {
            return false;
        }
        else
        {
            return true;
        }
    
    }
    
}
