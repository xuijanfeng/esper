/*
 ***************************************************************************************
 *  Copyright (C) 2006 EsperTech, Inc. All rights reserved.                            *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 ***************************************************************************************
 */
package com.espertech.esper.common.internal.epl.variable.core;

/**
 * Exception indicating a a variable already exists.
 */
public class VariableExistsException extends VariableDeclarationException {

    /**
     * Ctor.
     *
     * @param msg the exception message.
     */
    public VariableExistsException(String msg) {
        super(msg);
    }
}
