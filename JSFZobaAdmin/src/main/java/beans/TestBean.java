/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.ManagedBean;

/**
 *
 * @author yoka
 */
@ManagedBean(value = "testBean")
@SessionScoped
public class TestBean implements Serializable {

    /**
     * Creates a new instance of TestBean
     */
    public TestBean() {
    }
    
}
