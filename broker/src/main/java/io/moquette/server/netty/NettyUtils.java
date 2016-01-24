/*
 * Copyright (c) 2012-2015 The original author or authors
 * ------------------------------------------------------
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.moquette.server.netty;

import io.moquette.server.Constants;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.timeout.IdleStateHandler;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;

/**
 * Some Netty's channels utilities.
 *
 * @author andrea
 */
public class NettyUtils {

    public static final String ATTR_USERNAME = "username";
    public static final String ATTR_SESSION_STOLEN = "sessionStolen";

    public static final AttributeKey<Object> ATTR_KEY_KEEPALIVE = AttributeKey.valueOf(Constants.KEEP_ALIVE);
    public static final AttributeKey<Object> ATTR_KEY_CLEANSESSION = AttributeKey.valueOf(Constants.CLEAN_SESSION);
    public static final AttributeKey<Object> ATTR_KEY_CLIENTID = AttributeKey.valueOf(Constants.ATTR_CLIENTID);
    public static final AttributeKey<Object> ATTR_KEY_USERNAME = AttributeKey.valueOf(ATTR_USERNAME);
    public static final AttributeKey<Object> ATTR_KEY_SESSION_STOLEN = AttributeKey.valueOf(ATTR_SESSION_STOLEN);

    public static Object getAttribute(ChannelHandlerContext ctx, AttributeKey<Object> key) {
        Attribute<Object> attr = ctx.channel().attr(key);
        return attr.get();
    }


}