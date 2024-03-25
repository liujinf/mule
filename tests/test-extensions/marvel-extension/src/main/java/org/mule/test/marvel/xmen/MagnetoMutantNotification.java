/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.test.marvel.xmen;

import static org.mule.test.marvel.xmen.MagnetoMutantSummon.CLASSLOADER_NOTIFICATION_ACTION;
import static org.mule.test.marvel.xmen.MagnetoMutantSummon.ERROR_NOTIFICATION_ACTION;

import org.mule.runtime.api.notification.CustomNotification;


public class MagnetoMutantNotification extends CustomNotification {

  private static final long serialVersionUID = 1L;

  public MagnetoMutantNotification(Object message, int action) {
    super(message, action);
  }

  static {
    registerAction("Magento Mutant Error", ERROR_NOTIFICATION_ACTION);
    registerAction("Magneto Mutant Classloader", CLASSLOADER_NOTIFICATION_ACTION);
  }

}
