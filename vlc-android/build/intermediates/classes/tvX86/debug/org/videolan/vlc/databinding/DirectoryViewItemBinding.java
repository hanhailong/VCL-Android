package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.view.View;
public class DirectoryViewItemBinding extends android.databinding.ViewDataBinding {
    
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.CheckBox browserCheckbox;
    public final android.widget.ImageView dviIcon;
    public final android.widget.ImageView itemMore;
    public final android.widget.LinearLayout layoutItem;
    public final android.widget.TextView text;
    public final android.widget.TextView title;
    // variables
    private int mType;
    private boolean mHasContextMenu;
    private boolean mChecked;
    private org.videolan.vlc.gui.browser.BaseBrowserAdapter.Storage mStorage;
    private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ClickHandler mHandler;
    private boolean mChechEnabled;
    private org.videolan.vlc.MediaWrapper mMedia;
    private int mPosition;
    // values
    // listeners
    private OnClickListenerImpl mAndroidViewViewOnCl;
    private OnClickListenerImpl1 mAndroidViewViewOnCl1;
    private OnClickListenerImpl2 mAndroidViewViewOnCl2;
    
    public DirectoryViewItemBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.browserCheckbox = (android.widget.CheckBox) bindings[1];
        this.browserCheckbox.setTag(null);
        this.dviIcon = (android.widget.ImageView) bindings[2];
        this.dviIcon.setTag(null);
        this.itemMore = (android.widget.ImageView) bindings[5];
        this.itemMore.setTag(null);
        this.layoutItem = (android.widget.LinearLayout) bindings[0];
        this.layoutItem.setTag(null);
        this.text = (android.widget.TextView) bindings[4];
        this.text.setTag(null);
        this.title = (android.widget.TextView) bindings[3];
        this.title.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
    
    @Override
    public void invalidateAll() {
        synchronized(this) {
            mDirtyFlags = 0b100000000L;
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
            case BR.type :
                setType((int) variable);
                return true;
            case BR.hasContextMenu :
                setHasContextMenu((boolean) variable);
                return true;
            case BR.checked :
                setChecked((boolean) variable);
                return true;
            case BR.storage :
                setStorage((org.videolan.vlc.gui.browser.BaseBrowserAdapter.Storage) variable);
                return true;
            case BR.handler :
                setHandler((org.videolan.vlc.gui.browser.BaseBrowserAdapter.ClickHandler) variable);
                return true;
            case BR.chechEnabled :
                setChechEnabled((boolean) variable);
                return true;
            case BR.media :
                setMedia((org.videolan.vlc.MediaWrapper) variable);
                return true;
            case BR.position :
                setPosition((int) variable);
                return true;
        }
        return false;
    }
    
    public void setType(int type) {
        this.mType = type;
        synchronized(this) {
            mDirtyFlags |= 0b1L;
        }
        super.requestRebind();
    }
    public int getType() {
        return mType;
    }
    public void setHasContextMenu(boolean hasContextMenu) {
        this.mHasContextMenu = hasContextMenu;
        synchronized(this) {
            mDirtyFlags |= 0b10L;
        }
        super.requestRebind();
    }
    public boolean getHasContextMenu() {
        return mHasContextMenu;
    }
    public void setChecked(boolean checked) {
        this.mChecked = checked;
        synchronized(this) {
            mDirtyFlags |= 0b100L;
        }
        super.requestRebind();
    }
    public boolean getChecked() {
        return mChecked;
    }
    public void setStorage(org.videolan.vlc.gui.browser.BaseBrowserAdapter.Storage storage) {
        this.mStorage = storage;
        synchronized(this) {
            mDirtyFlags |= 0b1000L;
        }
        super.requestRebind();
    }
    public org.videolan.vlc.gui.browser.BaseBrowserAdapter.Storage getStorage() {
        return mStorage;
    }
    public void setHandler(org.videolan.vlc.gui.browser.BaseBrowserAdapter.ClickHandler handler) {
        this.mHandler = handler;
        synchronized(this) {
            mDirtyFlags |= 0b10000L;
        }
        super.requestRebind();
    }
    public org.videolan.vlc.gui.browser.BaseBrowserAdapter.ClickHandler getHandler() {
        return mHandler;
    }
    public void setChechEnabled(boolean chechEnabled) {
        this.mChechEnabled = chechEnabled;
        synchronized(this) {
            mDirtyFlags |= 0b100000L;
        }
        super.requestRebind();
    }
    public boolean getChechEnabled() {
        return mChechEnabled;
    }
    public void setMedia(org.videolan.vlc.MediaWrapper media) {
        this.mMedia = media;
        synchronized(this) {
            mDirtyFlags |= 0b1000000L;
        }
        super.requestRebind();
    }
    public org.videolan.vlc.MediaWrapper getMedia() {
        return mMedia;
    }
    public void setPosition(int position) {
        this.mPosition = position;
        synchronized(this) {
            mDirtyFlags |= 0b10000000L;
        }
        super.requestRebind();
    }
    public int getPosition() {
        return mPosition;
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
        int HasContextMenuVISIBL = 0;
        android.view.View.OnClickListener androidViewViewOnCli = null;
        int type = mType;
        boolean hasContextMenu = mHasContextMenu;
        boolean checked = mChecked;
        java.lang.String titleMedia = null;
        org.videolan.vlc.gui.browser.BaseBrowserAdapter.Storage storage = mStorage;
        boolean TypeInt2 = false;
        android.view.View.OnClickListener androidViewViewOnCli1 = null;
        boolean DescriptionMediaObje = false;
        android.view.View.OnClickListener androidViewViewOnCli2 = null;
        org.videolan.vlc.gui.browser.BaseBrowserAdapter.ClickHandler handler = mHandler;
        boolean chechEnabled = mChechEnabled;
        int TypeInt2VISIBLEViewG = 0;
        java.lang.String NameStorageObjectnul = null;
        boolean NameStorageObjectnul1 = false;
        int DescriptionMediaObje1 = 0;
        org.videolan.vlc.MediaWrapper media = mMedia;
        int position = mPosition;
        boolean TypeInt21 = false;
        java.lang.String descriptionMedia = null;
        int TypeInt2VISIBLEViewG1 = 0;
        java.lang.String nameStorage = null;
    
        if ((dirtyFlags & 0b100000001L) != 0) {
            // read type~
            type = type;
        
            // read !=~type~~int2
            TypeInt2 = type!=2;
            // read ==~type~~int2
            TypeInt21 = type==2;
            if((dirtyFlags & 0b100000001L) != 0) {
                if (TypeInt2) {
                    dirtyFlags |= 0b1000000000000L;
                } else {
                    dirtyFlags |= 0b100000000000L;
                }}
            if((dirtyFlags & 0b100000001L) != 0) {
                if (TypeInt21) {
                    dirtyFlags |= 0b1000000000000000000L;
                } else {
                    dirtyFlags |= 0b100000000000000000L;
                }}
        
            // read ?:!=~type~~int2~VISIBLE~.~View~~GONE~.~View~
            TypeInt2VISIBLEViewG = TypeInt2 ? android.view.View.VISIBLE : android.view.View.GONE;
            // read ?:==~type~~int2~VISIBLE~.~View~~GONE~.~View~
            TypeInt2VISIBLEViewG1 = TypeInt21 ? android.view.View.VISIBLE : android.view.View.GONE;
        }
        if ((dirtyFlags & 0b100010010L) != 0) {
            // read hasContextMenu~
            hasContextMenu = hasContextMenu;
            // read handler~
            handler = handler;
            if((dirtyFlags & 0b100000010L) != 0) {
                if (hasContextMenu) {
                    dirtyFlags |= 0b10000000000L;
                } else {
                    dirtyFlags |= 0b1000000000L;
                }}
        
            if ((dirtyFlags & 0b100000010L) != 0) {
                // read ?:hasContextMenu~~VISIBLE~.~View~~GONE~.~View~
                HasContextMenuVISIBL = hasContextMenu ? android.view.View.VISIBLE : android.view.View.GONE;
            }
            if ((dirtyFlags & 0b100010000L) != 0) {
                if (handler != null) {
                    // read android.view.View.OnClickListener~handler~~onCheckBoxClick
                    androidViewViewOnCli = (((mAndroidViewViewOnCl == null) ? (mAndroidViewViewOnCl = new OnClickListenerImpl()) : mAndroidViewViewOnCl).setValue(handler));
                    // read android.view.View.OnClickListener~handler~~onClick
                    androidViewViewOnCli2 = (((mAndroidViewViewOnCl2 == null) ? (mAndroidViewViewOnCl2 = new OnClickListenerImpl2()) : mAndroidViewViewOnCl2).setValue(handler));
                }
            }
            if (handler != null) {
                // read android.view.View.OnClickListener~handler~~onMoreClick
                androidViewViewOnCli1 = (((mAndroidViewViewOnCl1 == null) ? (mAndroidViewViewOnCl1 = new OnClickListenerImpl1()) : mAndroidViewViewOnCl1).setValue(handler));
            }
        }
        if ((dirtyFlags & 0b100000100L) != 0) {
            // read checked~
            checked = checked;
        }
        if ((dirtyFlags & 0b101001000L) != 0) {
            // read storage~
            storage = storage;
        
            if (storage != null) {
                // read name~.~storage~
                nameStorage = storage.getName();
            }
        
            // read ==~name~.~storage~~Objectnull
            NameStorageObjectnul1 = nameStorage==null;
            if((dirtyFlags & 0b101001000L) != 0) {
                if (NameStorageObjectnul1) {
                    dirtyFlags |= 0b100000000000000L;
                } else {
                    dirtyFlags |= 0b10000000000000L;
                }}
        }
        if ((dirtyFlags & 0b100100000L) != 0) {
            // read chechEnabled~
            chechEnabled = chechEnabled;
        }
        if ((dirtyFlags & 0b101000000L) != 0) {
            // read media~
            media = media;
        
            if (media != null) {
                // read description~.~media~
                descriptionMedia = media.getDescription();
            }
        
            // read !=~description~.~media~~Objectnull
            DescriptionMediaObje = descriptionMedia!=null;
            if((dirtyFlags & 0b101000000L) != 0) {
                if (DescriptionMediaObje) {
                    dirtyFlags |= 0b10000000000000000L;
                } else {
                    dirtyFlags |= 0b1000000000000000L;
                }}
        
            // read ?:!=~description~.~media~~Objectnull~VISIBLE~.~View~~INVISIBLE~.~View~
            DescriptionMediaObje1 = DescriptionMediaObje ? android.view.View.VISIBLE : android.view.View.INVISIBLE;
        }
        if ((dirtyFlags & 0b110000000L) != 0) {
            // read position~
            position = position;
        }
        // batch finished
    
        if ((dirtyFlags & 0b100000000000000L) != 0) {
            // read media~
            media = media;
        
            if (media != null) {
                // read title~.~media~
                titleMedia = media.getTitle();
            }
        }
    
        if ((dirtyFlags & 0b101001000L) != 0) {
            // read ?:==~name~.~storage~~Objectnull~title~.~media~~name~.~storage~
            NameStorageObjectnul = NameStorageObjectnul1 ? titleMedia : nameStorage;
        }
        // batch finished
        if ((dirtyFlags & 0b100000001L) != 0) {
            // api target 1
            this.browserCheckbox.setVisibility(TypeInt2VISIBLEViewG1);
            this.dviIcon.setVisibility(TypeInt2VISIBLEViewG);
        }
        if ((dirtyFlags & 0b100100000L) != 0) {
            // api target 1
            this.browserCheckbox.setEnabled(chechEnabled);
        }
        if ((dirtyFlags & 0b100000100L) != 0) {
            // api target 1
            this.browserCheckbox.setChecked(checked);
        }
        if ((dirtyFlags & 0b110000000L) != 0) {
            // api target 1
            this.browserCheckbox.setTag(position);
            this.itemMore.setTag(position);
        }
        if ((dirtyFlags & 0b100010000L) != 0) {
            // api target 1
            this.browserCheckbox.setOnClickListener(androidViewViewOnCli);
            this.layoutItem.setOnClickListener(androidViewViewOnCli2);
        }
        if ((dirtyFlags & 0b100000010L) != 0) {
            // api target 1
            this.itemMore.setVisibility(HasContextMenuVISIBL);
            this.layoutItem.setLongClickable(hasContextMenu);
        }
        if ((dirtyFlags & 0b100010010L) != 0) {
            // api target 1
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.itemMore, (android.view.View.OnClickListener)androidViewViewOnCli1, hasContextMenu);
        }
        if ((dirtyFlags & 0b101000000L) != 0) {
            // api target 1
            this.text.setText(descriptionMedia);
            this.text.setVisibility(DescriptionMediaObje1);
        }
        if ((dirtyFlags & 0b101001000L) != 0) {
            // api target 1
            this.title.setText(NameStorageObjectnul);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ClickHandler value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.browser.BaseBrowserAdapter.ClickHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onCheckBoxClick(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ClickHandler value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.browser.BaseBrowserAdapter.ClickHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoreClick(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ClickHandler value;
        public OnClickListenerImpl2 setValue(org.videolan.vlc.gui.browser.BaseBrowserAdapter.ClickHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0b1111111111111111111111111111111111111111111111111111111111111111L;
    
    public static DirectoryViewItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static DirectoryViewItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<DirectoryViewItemBinding>inflate(inflater, org.videolan.vlc.R.layout.directory_view_item, root, attachToRoot, bindingComponent);
    }
    public static DirectoryViewItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static DirectoryViewItemBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.directory_view_item, null, false), bindingComponent);
    }
    public static DirectoryViewItemBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static DirectoryViewItemBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/directory_view_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new DirectoryViewItemBinding(bindingComponent, view);
    }
}
    /* flag mapping
        flag 0: type~
        flag 1: hasContextMenu~
        flag 2: checked~
        flag 3: storage~
        flag 4: handler~
        flag 5: chechEnabled~
        flag 6: media~
        flag 7: position~
        flag 8: INVALIDATE ANY
        flag 9: ?:hasContextMenu~~VISIBLE~.~View~~GONE~.~View~== false
        flag 10: ?:hasContextMenu~~VISIBLE~.~View~~GONE~.~View~== true
        flag 11: ?:!=~type~~int2~VISIBLE~.~View~~GONE~.~View~== false
        flag 12: ?:!=~type~~int2~VISIBLE~.~View~~GONE~.~View~== true
        flag 13: ?:==~name~.~storage~~Objectnull~title~.~media~~name~.~storage~== false
        flag 14: ?:==~name~.~storage~~Objectnull~title~.~media~~name~.~storage~== true
        flag 15: ?:!=~description~.~media~~Objectnull~VISIBLE~.~View~~INVISIBLE~.~View~== false
        flag 16: ?:!=~description~.~media~~Objectnull~VISIBLE~.~View~~INVISIBLE~.~View~== true
        flag 17: ?:==~type~~int2~VISIBLE~.~View~~GONE~.~View~== false
        flag 18: ?:==~type~~int2~VISIBLE~.~View~~GONE~.~View~== true
    flag mapping end*/
    //end