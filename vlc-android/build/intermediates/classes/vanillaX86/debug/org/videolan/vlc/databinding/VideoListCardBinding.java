package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.view.View;
public class VideoListCardBinding extends android.databinding.ViewDataBinding {
    
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.ImageView itemMore;
    public final android.support.v7.widget.CardView layoutItem;
    public final android.widget.ProgressBar mlItemProgress;
    public final android.widget.TextView mlItemResolution;
    public final android.widget.ImageView mlItemThumbnail;
    public final android.widget.TextView mlItemTime;
    public final android.widget.TextView mlItemTitle;
    // variables
    private android.widget.ImageView.ScaleType mScaleType;
    private org.videolan.vlc.gui.video.VideoListAdapter.ClickHandler mHandler;
    private org.videolan.vlc.MediaWrapper mMedia;
    private int mMax;
    private int mProgress;
    private int mPosition;
    private java.lang.String mTime;
    private java.lang.String mResolution;
    private boolean mGroup;
    private android.graphics.drawable.BitmapDrawable mCover;
    // values
    // listeners
    private OnClickListenerImpl mAndroidViewViewOnCl;
    
    public VideoListCardBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.itemMore = (android.widget.ImageView) bindings[3];
        this.itemMore.setTag(null);
        this.layoutItem = (android.support.v7.widget.CardView) bindings[0];
        this.mlItemProgress = (android.widget.ProgressBar) bindings[6];
        this.mlItemProgress.setTag(null);
        this.mlItemResolution = (android.widget.TextView) bindings[5];
        this.mlItemResolution.setTag(null);
        this.mlItemThumbnail = (android.widget.ImageView) bindings[1];
        this.mlItemThumbnail.setTag(null);
        this.mlItemTime = (android.widget.TextView) bindings[4];
        this.mlItemTime.setTag(null);
        this.mlItemTitle = (android.widget.TextView) bindings[2];
        this.mlItemTitle.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
    
    @Override
    public void invalidateAll() {
        synchronized(this) {
            mDirtyFlags = 0b10000000000L;
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
            case BR.scaleType :
                setScaleType((android.widget.ImageView.ScaleType) variable);
                return true;
            case BR.handler :
                setHandler((org.videolan.vlc.gui.video.VideoListAdapter.ClickHandler) variable);
                return true;
            case BR.media :
                setMedia((org.videolan.vlc.MediaWrapper) variable);
                return true;
            case BR.max :
                setMax((int) variable);
                return true;
            case BR.progress :
                setProgress((int) variable);
                return true;
            case BR.position :
                setPosition((int) variable);
                return true;
            case BR.time :
                setTime((java.lang.String) variable);
                return true;
            case BR.resolution :
                setResolution((java.lang.String) variable);
                return true;
            case BR.group :
                setGroup((boolean) variable);
                return true;
            case BR.cover :
                setCover((android.graphics.drawable.BitmapDrawable) variable);
                return true;
        }
        return false;
    }
    
    public void setScaleType(android.widget.ImageView.ScaleType scaleType) {
        this.mScaleType = scaleType;
        synchronized(this) {
            mDirtyFlags |= 0b1L;
        }
        super.requestRebind();
    }
    public android.widget.ImageView.ScaleType getScaleType() {
        return mScaleType;
    }
    public void setHandler(org.videolan.vlc.gui.video.VideoListAdapter.ClickHandler handler) {
        this.mHandler = handler;
        synchronized(this) {
            mDirtyFlags |= 0b10L;
        }
        super.requestRebind();
    }
    public org.videolan.vlc.gui.video.VideoListAdapter.ClickHandler getHandler() {
        return mHandler;
    }
    public void setMedia(org.videolan.vlc.MediaWrapper media) {
        this.mMedia = media;
        synchronized(this) {
            mDirtyFlags |= 0b100L;
        }
        super.requestRebind();
    }
    public org.videolan.vlc.MediaWrapper getMedia() {
        return mMedia;
    }
    public void setMax(int max) {
        this.mMax = max;
        synchronized(this) {
            mDirtyFlags |= 0b1000L;
        }
        super.requestRebind();
    }
    public int getMax() {
        return mMax;
    }
    public void setProgress(int progress) {
        this.mProgress = progress;
        synchronized(this) {
            mDirtyFlags |= 0b10000L;
        }
        super.requestRebind();
    }
    public int getProgress() {
        return mProgress;
    }
    public void setPosition(int position) {
        this.mPosition = position;
        synchronized(this) {
            mDirtyFlags |= 0b100000L;
        }
        super.requestRebind();
    }
    public int getPosition() {
        return mPosition;
    }
    public void setTime(java.lang.String time) {
        this.mTime = time;
        synchronized(this) {
            mDirtyFlags |= 0b1000000L;
        }
        super.requestRebind();
    }
    public java.lang.String getTime() {
        return mTime;
    }
    public void setResolution(java.lang.String resolution) {
        this.mResolution = resolution;
        synchronized(this) {
            mDirtyFlags |= 0b10000000L;
        }
        super.requestRebind();
    }
    public java.lang.String getResolution() {
        return mResolution;
    }
    public void setGroup(boolean group) {
        this.mGroup = group;
        synchronized(this) {
            mDirtyFlags |= 0b100000000L;
        }
        super.requestRebind();
    }
    public boolean getGroup() {
        return mGroup;
    }
    public void setCover(android.graphics.drawable.BitmapDrawable cover) {
        this.mCover = cover;
        synchronized(this) {
            mDirtyFlags |= 0b1000000000L;
        }
        super.requestRebind();
    }
    public android.graphics.drawable.BitmapDrawable getCover() {
        return mCover;
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
        int GroupINVISIBLEViewVI = 0;
        int MaxInt0INVISIBLEView = 0;
        android.widget.ImageView.ScaleType scaleType = mScaleType;
        android.view.View.OnClickListener androidViewViewOnCli = null;
        boolean MaxInt0 = false;
        org.videolan.vlc.gui.video.VideoListAdapter.ClickHandler handler = mHandler;
        java.lang.String displayTitleMedia = null;
        org.videolan.vlc.MediaWrapper media = mMedia;
        int max = mMax;
        int progress = mProgress;
        int position = mPosition;
        java.lang.String time = mTime;
        java.lang.String resolution = mResolution;
        boolean group = mGroup;
        android.graphics.drawable.BitmapDrawable cover = mCover;
    
        if ((dirtyFlags & 0b10000000001L) != 0) {
            // read scaleType~
            scaleType = scaleType;
        }
        if ((dirtyFlags & 0b10000000010L) != 0) {
            // read handler~
            handler = handler;
        
            if (handler != null) {
                // read android.view.View.OnClickListener~handler~~onMoreClick
                androidViewViewOnCli = (((mAndroidViewViewOnCl == null) ? (mAndroidViewViewOnCl = new OnClickListenerImpl()) : mAndroidViewViewOnCl).setValue(handler));
            }
        }
        if ((dirtyFlags & 0b10000000100L) != 0) {
            // read media~
            media = media;
        
            if (media != null) {
                // read displayTitle~.~media~
                displayTitleMedia = media.getDisplayTitle();
            }
        }
        if ((dirtyFlags & 0b10000001000L) != 0) {
            // read max~
            max = max;
        
            // read ==~max~~int0
            MaxInt0 = max==0;
            if((dirtyFlags & 0b10000001000L) != 0) {
                if (MaxInt0) {
                    dirtyFlags |= 0b100000000000000L;
                } else {
                    dirtyFlags |= 0b10000000000000L;
                }}
        
            // read ?:==~max~~int0~INVISIBLE~.~View~~VISIBLE~.~View~
            MaxInt0INVISIBLEView = MaxInt0 ? android.view.View.INVISIBLE : android.view.View.VISIBLE;
        }
        if ((dirtyFlags & 0b10000010000L) != 0) {
            // read progress~
            progress = progress;
        }
        if ((dirtyFlags & 0b10000100000L) != 0) {
            // read position~
            position = position;
        }
        if ((dirtyFlags & 0b10001000000L) != 0) {
            // read time~
            time = time;
        }
        if ((dirtyFlags & 0b10010000000L) != 0) {
            // read resolution~
            resolution = resolution;
        }
        if ((dirtyFlags & 0b10100000000L) != 0) {
            // read group~
            group = group;
            if((dirtyFlags & 0b10100000000L) != 0) {
                if (group) {
                    dirtyFlags |= 0b1000000000000L;
                } else {
                    dirtyFlags |= 0b100000000000L;
                }}
        
            // read ?:group~~INVISIBLE~.~View~~VISIBLE~.~View~
            GroupINVISIBLEViewVI = group ? android.view.View.INVISIBLE : android.view.View.VISIBLE;
        }
        if ((dirtyFlags & 0b11000000000L) != 0) {
            // read cover~
            cover = cover;
        }
        // batch finished
        if ((dirtyFlags & 0b10000000010L) != 0) {
            // api target 1
            this.itemMore.setOnClickListener(androidViewViewOnCli);
        }
        if ((dirtyFlags & 0b10000100000L) != 0) {
            // api target 1
            this.itemMore.setTag(position);
        }
        if ((dirtyFlags & 0b10100000000L) != 0) {
            // api target 1
            this.itemMore.setVisibility(GroupINVISIBLEViewVI);
        }
        if ((dirtyFlags & 0b10000001000L) != 0) {
            // api target 1
            this.mlItemProgress.setMax(max);
            this.mlItemProgress.setVisibility(MaxInt0INVISIBLEView);
        }
        if ((dirtyFlags & 0b10000010000L) != 0) {
            // api target 1
            this.mlItemProgress.setProgress(progress);
        }
        if ((dirtyFlags & 0b10010000000L) != 0) {
            // api target 1
            this.mlItemResolution.setText(resolution);
        }
        if ((dirtyFlags & 0b10000000001L) != 0) {
            // api target 1
            this.mlItemThumbnail.setScaleType(scaleType);
        }
        if ((dirtyFlags & 0b11000000000L) != 0) {
            // api target 1
            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mlItemThumbnail, cover);
        }
        if ((dirtyFlags & 0b10001000000L) != 0) {
            // api target 1
            this.mlItemTime.setText(time);
        }
        if ((dirtyFlags & 0b10000000100L) != 0) {
            // api target 1
            this.mlItemTitle.setText(displayTitleMedia);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.video.VideoListAdapter.ClickHandler value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.video.VideoListAdapter.ClickHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoreClick(arg0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0b1111111111111111111111111111111111111111111111111111111111111111L;
    
    public static VideoListCardBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VideoListCardBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<VideoListCardBinding>inflate(inflater, org.videolan.vlc.R.layout.video_list_card, root, attachToRoot, bindingComponent);
    }
    public static VideoListCardBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VideoListCardBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.video_list_card, null, false), bindingComponent);
    }
    public static VideoListCardBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VideoListCardBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/video_list_card_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new VideoListCardBinding(bindingComponent, view);
    }
}
    /* flag mapping
        flag 0: scaleType~
        flag 1: handler~
        flag 2: media~
        flag 3: max~
        flag 4: progress~
        flag 5: position~
        flag 6: time~
        flag 7: resolution~
        flag 8: group~
        flag 9: cover~
        flag 10: INVALIDATE ANY
        flag 11: ?:group~~INVISIBLE~.~View~~VISIBLE~.~View~== false
        flag 12: ?:group~~INVISIBLE~.~View~~VISIBLE~.~View~== true
        flag 13: ?:==~max~~int0~INVISIBLE~.~View~~VISIBLE~.~View~== false
        flag 14: ?:==~max~~int0~INVISIBLE~.~View~~VISIBLE~.~View~== true
    flag mapping end*/
    //end