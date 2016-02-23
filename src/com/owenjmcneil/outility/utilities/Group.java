package com.owenjmcneil.outility.utilities;

import java.util.ArrayList;

import com.owenjmcneil.outility.interfaces.GroupMember;

public class Group {
	
	/**
	 * ArrayList of objects that implement the GroupMember interface
	 */
	private ArrayList<GroupMember> members = new ArrayList<GroupMember>();
	
	/**
	 * Method to update all group members that belong to this group. 
	 */
	public void updateMembers() {
		for (GroupMember member: members) {
			member.updateMe();
		}
	}
	
	/**
	 * Adds a GroupMember to the Group
	 * @param member GroupMember to be added
	 */
	public void addMember(GroupMember member) {
		members.add(member);
	}
	
	/**
	 * Removes a GroupMember from the Group
	 * @param member GroupMember to be removed
	 */
	public void removeMember(GroupMember member) {
		members.remove(member);
	}
	
	public ArrayList<GroupMember> getMembers() {
		return members;
	}
	
}
