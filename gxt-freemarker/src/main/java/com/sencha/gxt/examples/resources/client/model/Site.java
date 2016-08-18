/**
 * Sencha GXT 4.0.1 - Sencha for GWT
 * Copyright (c) 2006-2016, Sencha Inc.
 *
 * licensing@sencha.com
 * http://www.sencha.com/products/gxt/license/
 *
 * ================================================================================
 * Evaluation/Trial License
 * ================================================================================
 * This version of Sencha GXT is licensed commercially for a limited period for
 * evaluation purposes only. Production use or use beyond the applicable evaluation
 * period is prohibited under this license.
 *
 * Please see the Sencha GXT Licensing page at:
 * http://www.sencha.com/products/gxt/license/
 *
 * For clarification or additional options, please contact:
 * licensing@sencha.com
 * ================================================================================
 *
 *
 *
 *
 *
 *
 *
 * ================================================================================
 * Disclaimer
 * ================================================================================
 * THIS SOFTWARE IS DISTRIBUTED "AS-IS" WITHOUT ANY WARRANTIES, CONDITIONS AND
 * REPRESENTATIONS WHETHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES AND CONDITIONS OF MERCHANTABILITY, MERCHANTABLE QUALITY,
 * FITNESS FOR A PARTICULAR PURPOSE, DURABILITY, NON-INFRINGEMENT, PERFORMANCE AND
 * THOSE ARISING BY STATUTE OR FROM CUSTOM OR USAGE OF TRADE OR COURSE OF DEALING.
 * ================================================================================
 */
package com.sencha.gxt.examples.resources.client.model;

import java.util.Date;

public class Site {

  private Date date;
  private double visits;
  private double views;
  private double veins;
  
  public Site(Date date, double visits, double views, double veins) {
    this.date = date;
    this.visits = visits;
    this.views = views;
    this.veins = veins;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public double getVisits() {
    return visits;
  }

  public void setVisits(double visits) {
    this.visits = visits;
  }

  public double getViews() {
    return views;
  }

  public void setViews(double views) {
    this.views = views;
  }

  public double getVeins() {
    return veins;
  }

  public void setVeins(double veins) {
    this.veins = veins;
  }
  
  
}
