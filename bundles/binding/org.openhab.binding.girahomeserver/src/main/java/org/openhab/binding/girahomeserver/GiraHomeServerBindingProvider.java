/**
 * Copyright (c) 2010-2016, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.girahomeserver;

import org.openhab.core.binding.BindingProvider;
import org.openhab.core.types.Type;

/**
 * @author Jochen Mattes
 * @since 1.9.0
 */
public interface GiraHomeServerBindingProvider extends BindingProvider {

    /**
     * Returns the outbound communicationObject to write according to <code>itemName</code>.
     *
     * @param itemName
     *            the item for which to find a commandLine
     *
     * @return the matching communicationObject or <code>null</code> if no matching
     *         communicationObject could be found.
     */
    String getOutboundCommunicationObject(String itemName, Type value);

    String[] getItemNames(String communicationObject);
}
