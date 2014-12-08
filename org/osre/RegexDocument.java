package org.osre;

import javax.swing.text.*;
import java.util.regex.*;

public class RegexDocument extends PlainDocument {
    Pattern pattern;
    Matcher matcher;
    
    public RegexDocument() {
	super();
	pattern = Pattern.compile("[0-9]*");
    }

    public void insertString(int offs, String s, AttributeSet a) 
	throws BadLocationException {
	
	String proposedInsert = 
	    getText(0,offs) +
	    s + 
	    getText(offs, getLength() - offs);
	matcher = pattern.matcher(proposedInsert);
	if(matcher != null) {
	    matcher.reset(proposedInsert);
	    if(! matcher.matches()) {
		return;
	    }
	}
	super.insertString(offs,s,a);
    }
}
