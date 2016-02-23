package com.owenjmcneil.outility.testing;

import com.owenjmcneil.outility.interfaces.GroupMember;

public class Bird implements GroupMember{

	@Override
	public void updateMe() {
		System.out.println("Bird says hi!");
		
	}

}
