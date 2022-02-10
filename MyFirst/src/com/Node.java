package com;

import java.util.HashSet;
import java.util.Set;

public class Node {

	public Node() {
		// TODO Auto-generated constructor stub
	}
	ContentPreference preference=null;
	private Set<ContentPreference> contentPreferenceSet = new HashSet<>();
	
	
	public void removeSourceSet(String id, String type) {
		  Set<ContentPreference> preferencesetWithResourceRemoved = new HashSet<>(
		      this.contentPreferenceSet.size());
		  for (ContentPreference preference : this.contentPreferenceSet) {
			  
			  
		    if ((preference.getContentId().equals(id) && preference.getContentType()
		        .equalsIgnoreCase(type))) {
		      preferencesetWithResourceRemoved.add(preference);
		    }
		  }
		  if (!preferencesetWithResourceRemoved.isEmpty()) {
		    this.contentPreferenceSet.removeAll(preferencesetWithResourceRemoved);
		    
		  }
		//  return getIsContentPrefernceSetModified();
		}


}
