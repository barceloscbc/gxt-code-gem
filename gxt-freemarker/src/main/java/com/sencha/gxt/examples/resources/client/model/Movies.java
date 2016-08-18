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

public class Movies {

  private int year;
  private double action;
  private double comedy;
  private double drama;
  private double thriller;
  
  public Movies(int year, double action, double comedy, double drama, double thriller) {
    this.year = year;
    this.action = action;
    this.comedy = comedy;
    this.drama = drama;
    this.thriller = thriller;
  }

  public double getAction() {
    return action;
  }

  public double getComedy() {
    return comedy;
  }

  public double getDrama() {
    return drama;
  }

  public double getThriller() {
    return thriller;
  }

  public int getYear() {
    return year;
  }

  public void setAction(double action) {
    this.action = action;
  }

  public void setComedy(double comedy) {
    this.comedy = comedy;
  }

  public void setDrama(double drama) {
    this.drama = drama;
  }

  public void setThriller(double thriller) {
    this.thriller = thriller;
  }

  public void setYear(int year) {
    this.year = year;
  }
  
}
