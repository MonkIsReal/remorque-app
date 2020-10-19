/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package fr.remorques;


import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import fr.remorques.bean.User;

/**
 * A typical simple backing bean, that is backed to <code>helloWorld.xhtml</code>
 */
@Named(value = "userCtrl")
@RequestScoped
public class UserCtrl implements Serializable
{

    @Inject
    private User user;

    /**
     * default empty constructor
     */
    public UserCtrl()
    {
    	System.out.println("userctrl");
    }

    /**
     * Method that is backed to a submit button of a form.
     */
    public String afficheLogin()
    {
        //do real logic, return a string which will be used for the navigation system of JSF
        return "login.xhtml";
    }
    
    public void verifLogin()
    {
        //do real logic, return a string which will be used for the navigation system of JSF
        //return "bienvenue.xhtml";
    	FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Welcome " + user.getLogin() + " " + user.getMdp()));
    	//return "login.xhtml";
    }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


    //-------------------getter & setter

   
    

}
