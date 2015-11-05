
package android.databinding;
import org.videolan.vlc.BR;
class DataBinderMapper {
    final static int TARGET_MIN_SDK = 1;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
            case org.videolan.vlc.R.layout.video_grid_card:
                return org.videolan.vlc.databinding.VideoGridCardBinding.bind(view, bindingComponent);
            case org.videolan.vlc.R.layout.video_list_card:
                return org.videolan.vlc.databinding.VideoListCardBinding.bind(view, bindingComponent);
            case org.videolan.vlc.R.layout.browser_item_separator:
                return org.videolan.vlc.databinding.BrowserItemSeparatorBinding.bind(view, bindingComponent);
            case org.videolan.vlc.R.layout.directory_view_item:
                return org.videolan.vlc.databinding.DirectoryViewItemBinding.bind(view, bindingComponent);
            case org.videolan.vlc.R.layout.audio_browser_separator:
                return org.videolan.vlc.databinding.AudioBrowserSeparatorBinding.bind(view, bindingComponent);
            case org.videolan.vlc.R.layout.audio_browser_item:
                return org.videolan.vlc.databinding.AudioBrowserItemBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 833401969:
                if(tag.equals("layout/video_grid_card_0"))
                    return org.videolan.vlc.R.layout.video_grid_card;
                break;
            case -867279847:
                if(tag.equals("layout/video_list_card_0"))
                    return org.videolan.vlc.R.layout.video_list_card;
                break;
            case 674149798:
                if(tag.equals("layout/browser_item_separator_0"))
                    return org.videolan.vlc.R.layout.browser_item_separator;
                break;
            case -1882529561:
                if(tag.equals("layout/directory_view_item_0"))
                    return org.videolan.vlc.R.layout.directory_view_item;
                break;
            case 774895153:
                if(tag.equals("layout/audio_browser_separator_0"))
                    return org.videolan.vlc.R.layout.audio_browser_separator;
                break;
            case -1443691447:
                if(tag.equals("layout/audio_browser_item_0"))
                    return org.videolan.vlc.R.layout.audio_browser_item;
                break;
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"chechEnabled"
            ,"checked"
            ,"clickable"
            ,"cover"
            ,"footer"
            ,"group"
            ,"handler"
            ,"hasContextMenu"
            ,"item"
            ,"max"
            ,"media"
            ,"position"
            ,"progress"
            ,"resolution"
            ,"scaleType"
            ,"storage"
            ,"time"
            ,"title"
            ,"type"};
    }
}