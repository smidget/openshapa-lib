package org.openshapa.views.continuous;

import javax.swing.ImageIcon;
import javax.swing.filechooser.FileFilter;

import org.openshapa.views.component.DefaultTrackPainter;
import org.openshapa.views.component.TrackPainter;


/**
 * Plugin interface - specifies the methods an OpenSHAPA plugin must implement.
 */
public interface Plugin {

    /**
     * @return A new instance of the plugins data viewer.
     */
    DataViewer getNewDataViewer();

    /**
     * @return The filter to use when looking for files that the plugins data
     *         viewer supports.
     */
    FileFilter getFileFilter();

    /**
     * @return The icon for representing this plugin. This can return null if
     *         this plugin has no icon representing its type.
     */
    ImageIcon getTypeIcon();

    /**
     * @return Custom track painter implementation. Must not return null.
     * Plugins that do not have a custom track painter implementation should
     * return {@link DefaultTrackPainter}.
     */
    TrackPainter getTrackPainter();
}
