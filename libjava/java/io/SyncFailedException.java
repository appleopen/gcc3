/* SyncFailedException.java -- The sync failed (?)
   Copyright (C) 1998, 1999, 2001 Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.
 
GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
02111-1307 USA.

As a special exception, if you link this library with other files to
produce an executable, this library does not by itself cause the
resulting executable to be covered by the GNU General Public License.
This exception does not however invalidate any other reasons why the
executable file might be covered by the GNU General Public License. */


package java.io;

/* Written using "Java Class Libraries", 2nd edition, ISBN 0-201-31002-3
 * "The Java Language Specification", ISBN 0-201-63451-1
 * Status:  Complete to 1.1.
 */

/**
  * I really wish I knew what caused this exception to be thrown.
  *
  * @version 0.0
  *
  * @author Aaron M. Renn (arenn@urbanophile.com)
  * @author Tom Tromey <tromey@cygnus.com>
  * @date September 24, 1998
  */
public class SyncFailedException extends IOException
{

private static final long serialVersionUID = -2353342684412443330L;

/*
 * Constructors
 */

/**
  * Create a new SyncFailedException without a descriptive error message
  */
SyncFailedException()
{
  super();
}

/*************************************************************************/

/**
  * Create a new SyncFailedException with a descriptive error message String
  *
  * @param message The descriptive error message
  */
public
SyncFailedException(String message)
{
  super(message);
}

} // class SyncFailedException

