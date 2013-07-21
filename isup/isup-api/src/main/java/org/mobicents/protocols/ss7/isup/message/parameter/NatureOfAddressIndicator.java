/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2012, Telestax Inc and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

/**
 * Start time:10:27:43 2009-07-23<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com">Bartosz Baranowski </a>

 */
package org.mobicents.protocols.ss7.isup.message.parameter;

/**
 * Start time:10:27:43 2009-07-23<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 */
public interface NatureOfAddressIndicator {

    /**
     * nature of address indicator value. See Q.763 - 3.9b
     */
    int _SPARE = 0;
    /**
     * nature of address indicator value. See Q.763 - 3.9b
     */
    int _SUBSCRIBER = 1;
    /**
     * nature of address indicator value. See Q.763 - 3.9b
     */
    int _UNKNOWN = 2;
    /**
     * nature of address indicator value. See Q.763 - 3.9b
     */
    int _NATIONAL = 3;
    /**
     * nature of address indicator value. See Q.763 - 3.9b
     */
    int _INTERNATIONAL = 4;
    /**
     * nature of address indicator value. See Q.763 - 3.9b
     */
    int _NETWORK_SPECIFIC = 5;
}
