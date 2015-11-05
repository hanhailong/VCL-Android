package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.view.View;
public class AudioBrowserItemBinding extends android.databinding.ViewDataBinding {
    
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.ImageView cover;
    public final android.view.View footer;
    public final android.widget.ImageView itemMore;
    public final android.widget.LinearLayout layoutItem;
    public final android.widget.TextView subtitle;
    public final android.widget.TextView title;
    // variables
    private boolean mClickable;
    private boolean mFooter;
    private org.videolan.vlc.gui.audio.AudioBrowserListAdapter.ListItem mItem;
    private org.videolan.vlc.interfaces.IAudioClickHandler mHandler;
    private org.videolan.vlc.MediaWrapper mMedia;
    private int mPosition;
    private android.graphics.drawable.BitmapDrawable mCover;
    // values
    // listeners
    private OnClickListenerImpl mAndroidViewViewOnCl;
    
    public AudioBrowserItemBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.cover = (android.widget.ImageView) bindings[1];
        this.cover.setTag(null);
        this.footer = (android.view.View) bindings[5];
        this.footer.setTag(null);
        this.itemMore = (android.widget.ImageView) bindings[4];
        this.itemMore.setTag(null);
        this.layoutItem = (android.widget.LinearLayout) bindings[0];
        this.subtitle = (android.widget.TextView) bindings[3];
        this.subtitle.setTag(null);
        this.title = (android.widget.TextView) bindings[2];
        this.title.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
    
    @Override
    public void invalidateAll() {
        synchronized(this) {
            mDirtyFlags = 0b10000000L;
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
            case BR.clickable :
                setClickable((boolean) variable);
                return true;
            case BR.footer :
                setFooter((boolean) variable);
                return true;
            case BR.item :
                setItem((org.videolan.vlc.gui.audio.AudioBrowserListAdapter.ListItem) variable);
                return true;
            case BR.handler :
                setHandler((org.videolan.vlc.interfaces.IAudioClickHandler) variable);
                return true;
            case BR.media :
                setMedia((org.videolan.vlc.MediaWrapper) variable);
                return true;
            case BR.position :
                setPosition((int) variable);
                return true;
            case BR.cover :
                setCover((android.graphics.drawable.BitmapDrawable) variable);
                return true;
        }
        return false;
    }
    
    public void setClickable(boolean clickable) {
        this.mClickable = clickable;
        synchronized(this) {
            mDirtyFlags |= 0b1L;
        }
        super.requestRebind();
    }
    public boolean getClickable() {
        return mClickable;
    }
    public void setFooter(boolean footer) {
        this.mFooter = footer;
        synchronized(this) {
            mDirtyFlags |= 0b10L;
        }
        super.requestRebind();
    }
    public boolean getFooter() {
        return mFooter;
    }
    public void setItem(org.videolan.vlc.gui.audio.AudioBrowserListAdapter.ListItem item) {
        this.mItem = item;
        synchronized(this) {
            mDirtyFlags |= 0b100L;
        }
        super.requestRebind();
    }
    public org.videolan.vlc.gui.audio.AudioBrowserListAdapter.ListItem getItem() {
        return mItem;
    }
    public void setHandler(org.videolan.vlc.interfaces.IAudioClickHandler handler) {
        this.mHandler = handler;
        synchronized(this) {
            mDirtyFlags |= 0b1000L;
        }
        super.requestRebind();
    }
    public org.videolan.vlc.interfaces.IAudioClickHandler getHandler() {
        return mHandler;
    }
    public void setMedia(org.videolan.vlc.MediaWrapper media) {
        this.mMedia = media;
        synchronized(this) {
            mDirtyFlags |= 0b10000L;
        }
        super.requestRebind();
    }
    public org.videolan.vlc.MediaWrapper getMedia() {
        return mMedia;
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
    public void setCover(android.graphics.drawable.BitmapDrawable cover) {
        this.mCover = cover;
        synchronized(this) {
            mDirtyFlags |= 0b1000000L;
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
        boolean clickable = mClickable;
        java.lang.String artistMedia = null;
        boolean ArtistMediaObjectnul = false;
        boolean TextUtilsIsEmptyText = false;
        boolean footer = mFooter;
        java.lang.String titleMedia = null;
        org.videolan.vlc.gui.audio.AudioBrowserListAdapter.ListItem item = mItem;
        android.view.View.OnClickListener androidViewViewOnCli = null;
        boolean TitleMediaObjectnull = false;
        org.videolan.vlc.interfaces.IAudioClickHandler handler = mHandler;
        java.lang.String mTitleItem = null;
        int CoverObjectnullVISIB = 0;
        java.lang.String mSubTitleItem = null;
        boolean CoverObjectnull = false;
        boolean TextUtilsIsEmptyText1 = false;
        boolean TextUtilsIsEmptyText2 = false;
        org.videolan.vlc.MediaWrapper media = mMedia;
        int position = mPosition;
        int ClickableVISIBLEView = 0;
        java.lang.String TitleMediaObjectnull1 = null;
        int TextUtilsIsEmptyText3 = 0;
        int FooterVISIBLEViewGON = 0;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        java.lang.String ArtistMediaObjectnul1 = null;
    
        if ((dirtyFlags & 0b10001001L) != 0) {
            // read clickable~
            clickable = clickable;
            // read handler~
            handler = handler;
            if((dirtyFlags & 0b10000001L) != 0) {
                if (clickable) {
                    dirtyFlags |= 0b10000000000000L;
                } else {
                    dirtyFlags |= 0b1000000000000L;
                }}
        
            if ((dirtyFlags & 0b10000001L) != 0) {
                // read ?:clickable~~VISIBLE~.~View~~GONE~.~View~
                ClickableVISIBLEView = clickable ? android.view.View.VISIBLE : android.view.View.GONE;
            }
            if (handler != null) {
                // read android.view.View.OnClickListener~handler~~onMoreClick
                androidViewViewOnCli = (((mAndroidViewViewOnCl == null) ? (mAndroidViewViewOnCl = new OnClickListenerImpl()) : mAndroidViewViewOnCl).setValue(handler));
            }
        }
        if ((dirtyFlags & 0b10000010L) != 0) {
            // read footer~
            footer = footer;
            if((dirtyFlags & 0b10000010L) != 0) {
                if (footer) {
                    dirtyFlags |= 0b10000000000000000000L;
                } else {
                    dirtyFlags |= 0b1000000000000000000L;
                }}
        
            // read ?:footer~~VISIBLE~.~View~~GONE~.~View~
            FooterVISIBLEViewGON = footer ? android.view.View.VISIBLE : android.view.View.GONE;
        }
        if ((dirtyFlags & 0b10010100L) != 0) {
            // read item~
            item = item;
            // read media~
            media = media;
        
            if (item != null) {
                // read mSubTitle~.~item~
                mSubTitleItem = item.mSubTitle;
            }
            if (media != null) {
                // read artist~.~media~
                artistMedia = media.getArtist();
                // read title~.~media~
                titleMedia = media.getTitle();
            }
        
            // read TextUtils~~isEmpty~TextUtils~~mSubTitle~.~item~
            TextUtilsIsEmptyText1 = android.text.TextUtils.isEmpty(mSubTitleItem);
            // read ==~artist~.~media~~Objectnull
            ArtistMediaObjectnul = artistMedia==null;
            // read ==~title~.~media~~Objectnull
            TitleMediaObjectnull = titleMedia==null;
            if((dirtyFlags & 0b10010100L) != 0) {
                if (TextUtilsIsEmptyText1) {
                    dirtyFlags |= 0b1000000000L;
                } else {
                    dirtyFlags |= 0b100000000L;
                }}
            if((dirtyFlags & 0b10010100L) != 0) {
                if (ArtistMediaObjectnul) {
                    dirtyFlags |= 0b1000000000000000000000L;
                } else {
                    dirtyFlags |= 0b100000000000000000000L;
                }}
            if((dirtyFlags & 0b10010100L) != 0) {
                if (TitleMediaObjectnull) {
                    dirtyFlags |= 0b1000000000000000L;
                } else {
                    dirtyFlags |= 0b100000000000000L;
                }}
        }
        if ((dirtyFlags & 0b10100000L) != 0) {
            // read position~
            position = position;
        }
        if ((dirtyFlags & 0b11000000L) != 0) {
            // read cover~
            cover = cover;
        
            // read !=~cover~~Objectnull
            CoverObjectnull = cover!=null;
            if((dirtyFlags & 0b11000000L) != 0) {
                if (CoverObjectnull) {
                    dirtyFlags |= 0b100000000000L;
                } else {
                    dirtyFlags |= 0b10000000000L;
                }}
        
            // read ?:!=~cover~~Objectnull~VISIBLE~.~View~~GONE~.~View~
            CoverObjectnullVISIB = CoverObjectnull ? android.view.View.VISIBLE : android.view.View.GONE;
        }
        // batch finished
    
        if ((dirtyFlags & 0b1000000000000000L) != 0) {
            if (item != null) {
                // read mTitle~.~item~
                mTitleItem = item.mTitle;
            }
        }
        if ((dirtyFlags & 0b1000000000L) != 0) {
            // read TextUtils~~isEmpty~TextUtils~~artist~.~media~
            TextUtilsIsEmptyText2 = android.text.TextUtils.isEmpty(artistMedia);
        }
        if ((dirtyFlags & 0b10010100L) != 0) {
            // read ?:==~artist~.~media~~Objectnull~mSubTitle~.~item~~artist~.~media~
            ArtistMediaObjectnul1 = ArtistMediaObjectnul ? mSubTitleItem : artistMedia;
        }
    
        if ((dirtyFlags & 0b10010100L) != 0) {
            // read ?:TextUtils~~isEmpty~TextUtils~~mSubTitle~.~item~~TextUtils~~isEmpty~TextUtils~~artist~.~media~~booleanfalse
            TextUtilsIsEmptyText = TextUtilsIsEmptyText1 ? TextUtilsIsEmptyText2 : false;
            // read ?:==~title~.~media~~Objectnull~mTitle~.~item~~title~.~media~
            TitleMediaObjectnull1 = TitleMediaObjectnull ? mTitleItem : titleMedia;
            if((dirtyFlags & 0b10010100L) != 0) {
                if (TextUtilsIsEmptyText) {
                    dirtyFlags |= 0b100000000000000000L;
                } else {
                    dirtyFlags |= 0b10000000000000000L;
                }}
        
            // read ?:?:TextUtils~~isEmpty~TextUtils~~mSubTitle~.~item~~TextUtils~~isEmpty~TextUtils~~artist~.~media~~booleanfalse~GONE~.~View~~VISIBLE~.~View~
            TextUtilsIsEmptyText3 = TextUtilsIsEmptyText ? android.view.View.GONE : android.view.View.VISIBLE;
        }
        // batch finished
        if ((dirtyFlags & 0b11000000L) != 0) {
            // api target 1
            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.cover, cover);
            this.cover.setVisibility(CoverObjectnullVISIB);
        }
        if ((dirtyFlags & 0b10000010L) != 0) {
            // api target 1
            this.footer.setVisibility(FooterVISIBLEViewGON);
        }
        if ((dirtyFlags & 0b10100000L) != 0) {
            // api target 1
            this.itemMore.setTag(position);
        }
        if ((dirtyFlags & 0b10000001L) != 0) {
            // api target 1
            this.itemMore.setVisibility(ClickableVISIBLEView);
        }
        if ((dirtyFlags & 0b10001001L) != 0) {
            // api target 1
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.itemMore, (android.view.View.OnClickListener)androidViewViewOnCli, clickable);
        }
        if ((dirtyFlags & 0b10010100L) != 0) {
            // api target 1
            this.subtitle.setText(ArtistMediaObjectnul1);
            this.subtitle.setVisibility(TextUtilsIsEmptyText3);
            this.title.setText(TitleMediaObjectnull1);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.interfaces.IAudioClickHandler value;
        public OnClickListenerImpl setValue(org.videolan.vlc.interfaces.IAudioClickHandler value) {
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
    
    public static AudioBrowserItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioBrowserItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<AudioBrowserItemBinding>inflate(inflater, org.videolan.vlc.R.layout.audio_browser_item, root, attachToRoot, bindingComponent);
    }
    public static AudioBrowserItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioBrowserItemBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.audio_browser_item, null, false), bindingComponent);
    }
    public static AudioBrowserItemBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioBrowserItemBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/audio_browser_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new AudioBrowserItemBinding(bindingComponent, view);
    }
}
    /* flag mapping
        flag 0: clickable~
        flag 1: footer~
        flag 2: item~
        flag 3: handler~
        flag 4: media~
        flag 5: position~
        flag 6: cover~
        flag 7: INVALIDATE ANY
        flag 8: ?:TextUtils~~isEmpty~TextUtils~~mSubTitle~.~item~~TextUtils~~isEmpty~TextUtils~~artist~.~media~~booleanfalse== false
        flag 9: ?:TextUtils~~isEmpty~TextUtils~~mSubTitle~.~item~~TextUtils~~isEmpty~TextUtils~~artist~.~media~~booleanfalse== true
        flag 10: ?:!=~cover~~Objectnull~VISIBLE~.~View~~GONE~.~View~== false
        flag 11: ?:!=~cover~~Objectnull~VISIBLE~.~View~~GONE~.~View~== true
        flag 12: ?:clickable~~VISIBLE~.~View~~GONE~.~View~== false
        flag 13: ?:clickable~~VISIBLE~.~View~~GONE~.~View~== true
        flag 14: ?:==~title~.~media~~Objectnull~mTitle~.~item~~title~.~media~== false
        flag 15: ?:==~title~.~media~~Objectnull~mTitle~.~item~~title~.~media~== true
        flag 16: ?:?:TextUtils~~isEmpty~TextUtils~~mSubTitle~.~item~~TextUtils~~isEmpty~TextUtils~~artist~.~media~~booleanfalse~GONE~.~View~~VISIBLE~.~View~== false
        flag 17: ?:?:TextUtils~~isEmpty~TextUtils~~mSubTitle~.~item~~TextUtils~~isEmpty~TextUtils~~artist~.~media~~booleanfalse~GONE~.~View~~VISIBLE~.~View~== true
        flag 18: ?:footer~~VISIBLE~.~View~~GONE~.~View~== false
        flag 19: ?:footer~~VISIBLE~.~View~~GONE~.~View~== true
        flag 20: ?:==~artist~.~media~~Objectnull~mSubTitle~.~item~~artist~.~media~== false
        flag 21: ?:==~artist~.~media~~Objectnull~mSubTitle~.~item~~artist~.~media~== true
    flag mapping end*/
    //end