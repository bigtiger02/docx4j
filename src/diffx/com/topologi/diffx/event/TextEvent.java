package com.topologi.diffx.event;


/**
 * An interface for any data that comes from a text node.
 * 
 * @author Christophe Lauret
 * @version 21 December 2004
 */
public interface TextEvent extends DiffXEvent {

  /**
   * Returns the characters that this event represents.
   * 
   * <p>Note: this method will return the characters as used by Java (ie. Unicode), they
   * may not be suitable for writing to an XML string.
   * 
   * @return The characters that this event represents.
   */
  String getCharacters();

}