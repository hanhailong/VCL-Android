package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.view.View;
public class AudioBrowserSeparatorBinding extends android.databinding.ViewDataBinding {
    
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.LinearLayout layoutItem;
    public final android.widget.TextView title;
    // variables
    private org.videolan.vlc.gui.audio.AudioBrowserListAdapter.ListItem mItem;
    // values
    // listeners
    
    public AudioBrowserSeparatorBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds);
        this.layoutItem = (android.widget.LinearLayout) bindings[0];
        this.title = (android.widget.TextView) bindings[1];
        this.title.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
    
    @Override
    public void invalidateAll() {
        synchronized(this) {
            mDirtyFlags = 0b10L;
        }
        requestRebind();
    }
    
    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }
    
    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.item :
                setItem((org.videolan.vlc.gui.audio.AudioBrowserListAdapter.ListItem) variable);
                return true;
        }
        return false;
    }
    
    public void setItem(org.videolan.vlc.gui.audio.AudioBrowserListAdapter.ListItem item) {
        this.mItem = item;
        synchronized(this) {
            mDirtyFlags |= 0b1L;
        }
        super.requestRebind();
    }
    public org.videolan.vlc.gui.audio.AudioBrowserListAdapter.ListItem getItem() {
        return mItem;
    }
    
    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }
    
    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        org.videolan.vlc.gui.audio.AudioBrowserListAdapter.ListItem item = mItem;
        java.lang.String mTitleItem = null;
    
        if ((dirtyFlags & 0b11L) != 0) {
            // read item~
            item = item;
        
            if (item != null) {
                // read mTitle~.~item~
                mTitleItem = item.mTitle;
            }
        }
        // batch finished
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.title.setText(mTitleItem);
        }
    }
    // Listener Stub Implementations
    // dirty flag
    private  long mDirtyFlags = 0b1111111111111111111111111111111111111111111111111111111111111111L;
    
    public static AudioBrowserSeparatorBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioBrowserSeparatorBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<AudioBrowserSeparatorBinding>inflate(inflater, org.videolan.vlc.R.layout.audio_browser_separator, root, attachToRoot, bindingComponent);
    }
    public static AudioBrowserSeparatorBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioBrowserSeparatorBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.audio_browser_separator, null, false), bindingComponent);
    }
    public static AudioBrowserSeparatorBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioBrowserSeparatorBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/audio_browser_separator_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new AudioBrowserSeparatorBinding(bindingComponent, view);
    }
}
    /* flag mapping
        flag 0: item~
        flag 1: INVALIDATE ANY
    flag mapping end*/
    //end