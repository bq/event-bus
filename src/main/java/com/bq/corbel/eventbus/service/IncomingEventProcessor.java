package com.bq.corbel.eventbus.service;

import com.bq.corbel.eventbus.Event;

/**
 * @author Francisco Sanchez
 */
public interface IncomingEventProcessor {

    public void process(Event event);
}
