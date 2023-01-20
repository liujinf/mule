/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.core.api.exception;

import org.mule.runtime.api.component.ComponentIdentifier;
import org.mule.runtime.api.exception.ErrorTypeRepository;
import org.mule.runtime.api.message.error.matcher.ErrorTypeMatcherUtils;

/**
 * @deprecated create the {@link org.mule.runtime.api.message.error.matcher.ErrorTypeMatcher} using
 *             {@link ErrorTypeMatcherUtils#createErrorTypeMatcher(ErrorTypeRepository, String)}
 */
@Deprecated
public final class WildcardErrorTypeMatcher extends org.mule.runtime.api.message.error.matcher.WildcardErrorTypeMatcher
    implements ErrorTypeMatcher {

  public WildcardErrorTypeMatcher(ComponentIdentifier errorTypeIdentifier) {
    super(errorTypeIdentifier);
  }

}
