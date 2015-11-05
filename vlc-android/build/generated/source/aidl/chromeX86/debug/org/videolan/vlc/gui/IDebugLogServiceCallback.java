/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/HanHailong/android-workspace/VLCDemo/vlc-android/src/org/videolan/vlc/gui/IDebugLogServiceCallback.aidl
 */
package org.videolan.vlc.gui;
public interface IDebugLogServiceCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.videolan.vlc.gui.IDebugLogServiceCallback
{
private static final java.lang.String DESCRIPTOR = "org.videolan.vlc.gui.IDebugLogServiceCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.videolan.vlc.gui.IDebugLogServiceCallback interface,
 * generating a proxy if needed.
 */
public static org.videolan.vlc.gui.IDebugLogServiceCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.videolan.vlc.gui.IDebugLogServiceCallback))) {
return ((org.videolan.vlc.gui.IDebugLogServiceCallback)iin);
}
return new org.videolan.vlc.gui.IDebugLogServiceCallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onStarted:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _arg0;
_arg0 = data.createStringArrayList();
this.onStarted(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onStopped:
{
data.enforceInterface(DESCRIPTOR);
this.onStopped();
reply.writeNoException();
return true;
}
case TRANSACTION_onLog:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onLog(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onSaved:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
java.lang.String _arg1;
_arg1 = data.readString();
this.onSaved(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.videolan.vlc.gui.IDebugLogServiceCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void onStarted(java.util.List<java.lang.String> logList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringList(logList);
mRemote.transact(Stub.TRANSACTION_onStarted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onStopped() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onStopped, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onLog(java.lang.String msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(msg);
mRemote.transact(Stub.TRANSACTION_onLog, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onSaved(boolean success, java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((success)?(1):(0)));
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_onSaved, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onStopped = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onLog = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onSaved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void onStarted(java.util.List<java.lang.String> logList) throws android.os.RemoteException;
public void onStopped() throws android.os.RemoteException;
public void onLog(java.lang.String msg) throws android.os.RemoteException;
public void onSaved(boolean success, java.lang.String path) throws android.os.RemoteException;
}
