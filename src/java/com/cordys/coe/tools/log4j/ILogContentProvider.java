package com.cordys.coe.tools.log4j;

import java.io.IOException;

/**
 * This interface can be used to be able to view large log message sources in steps.
 *
 * @author  pgussow
 */
public interface ILogContentProvider
{
    /**
     * This method closes the content provider.
     */
    void close();

    /**
     * This method gets the name of the content provider.
     *
     * @return  The name of the content provider.
     */
    String getName();

    /**
     * This method reads the next set of data from the log source.
     *
     * @param   lpPanel  The panel that should handle the read log messages.
     *
     * @throws  IOException  DOCUMENTME
     */
    void getNextDataset(Log4JPanel lpPanel)
                 throws IOException;

    /**
     * This method reads the next set of data from the log source.
     *
     * @param   lpPanel  The panel that should handle the read log messages.
     *
     * @throws  IOException  DOCUMENTME
     */
    void getPreviousDataset(Log4JPanel lpPanel)
                     throws IOException;
}
