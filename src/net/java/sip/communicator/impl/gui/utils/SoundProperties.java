/*
 * SIP Communicator, the OpenSource Java VoIP and Instant Messaging client.
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package net.java.sip.communicator.impl.gui.utils;

import net.java.sip.communicator.impl.gui.*;
import net.java.sip.communicator.service.resources.*;

/**
 * Manages the access to the properties file containing all sounds paths.
 * 
 * @author Yana Stamcheva
 */
public final class SoundProperties
{
    public static final String INCOMING_MESSAGE;

    public static final String OUTGOING_CALL;

    public static final String INCOMING_CALL;

    public static final String DIAL_ZERO;

    public static final String DIAL_ONE;

    public static final String DIAL_TWO;

    public static final String DIAL_THREE;

    public static final String DIAL_FOUR;

    public static final String DIAL_FIVE;

    public static final String DIAL_SIX;

    public static final String DIAL_SEVEN;

    public static final String DIAL_EIGHT;

    public static final String DIAL_NINE;

    public static final String DIAL_DIEZ;

    public static final String DIAL_STAR;

    public static final String BUSY;

    public static final String ZRTP_SECURE;

    public static final String ZRTP_ALERT;

    static
    {

        /*
         * Call GuiActivator.getResources() once because (1) it's not a trivial
         * getter, it caches the reference so it always checks whether the cache
         * has already been built and (2) accessing a local variable is supposed
         * to be faster than calling a method (even if the method is a trivial
         * getter and it's inlined at runtime, it's still supposed to be slower
         * because it will be accessing a field, not a local variable).
         */
        ResourceManagementService resources = GuiActivator.getResources();

        INCOMING_MESSAGE = resources.getSoundPath("INCOMING_MESSAGE");
        OUTGOING_CALL = resources.getSoundPath("OUTGOING_CALL");
        INCOMING_CALL = resources.getSoundPath("INCOMING_CALL");
        DIAL_ZERO = resources.getSoundPath("DIAL_ZERO");
        DIAL_ONE = resources.getSoundPath("DIAL_ONE");
        DIAL_TWO = resources.getSoundPath("DIAL_TWO");
        DIAL_THREE = resources.getSoundPath("DIAL_THREE");
        DIAL_FOUR = resources.getSoundPath("DIAL_FOUR");
        DIAL_FIVE = resources.getSoundPath("DIAL_FIVE");
        DIAL_SIX = resources.getSoundPath("DIAL_SIX");
        DIAL_SEVEN = resources.getSoundPath("DIAL_SEVEN");
        DIAL_EIGHT = resources.getSoundPath("DIAL_EIGHT");
        DIAL_NINE = resources.getSoundPath("DIAL_NINE");
        DIAL_DIEZ = resources.getSoundPath("DIAL_DIEZ");
        DIAL_STAR = resources.getSoundPath("DIAL_STAR");
        BUSY = resources.getSoundPath("BUSY");
        ZRTP_SECURE = resources.getSoundPath("ZRTP_SECURE");
        ZRTP_ALERT = resources.getSoundPath("ZRTP_ALERT");
    }

    private SoundProperties() {
    }
}
