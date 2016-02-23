package com.owenjmcneil.outility.testing;

import com.owenjmcneil.outility.interfaces.GroupMember;

public class Pig implements GroupMember{

	@Override
	public void updateMe() {
		System.out.println("Pig says hi!");
		
	}

}
