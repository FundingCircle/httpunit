package com.meterware.httpunit;
/********************************************************************************************************************
 * $Id: DialogResponder.java 312 2002-08-21 19:06:27Z russgold $
 *
 * Copyright (c) 2002, Russell Gold
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
 * to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions
 * of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 *******************************************************************************************************************/


/**
 * Interface for an object to supply user responses to dialogs.
 *
 * @author <a href="mailto:russgold@acm.org">Russell Gold</a>
 **/
public interface DialogResponder {


    /**
     * Invoked when the user agent needs to display a confirmation dialog. This method should return true
     * to accept the proposed action or false to reject it.
     */
    public boolean getConfirmation( String confirmationPrompt );


    /**
     * Invoked when the user agent needs to display a generic dialog and obtain a user response. This method
     * should return the user's answer.
     */
    public String getUserResponse( String prompt, String defaultResponse );

}
