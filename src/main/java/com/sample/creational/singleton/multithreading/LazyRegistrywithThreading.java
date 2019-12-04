package com.sample.creational.singleton.multithreading;

public class LazyRegistrywithThreading {

	private LazyRegistrywithThreading() {

	}

	// Use volatile to allow thread to get new value instead cached value

	private static volatile LazyRegistrywithThreading INSTANCE;
	private static LazyRegistrywithThreading NON_SYNC_INSTANCE;
	private static LazyRegistrywithThreading DBL_CHK_INSTANCE;

	// CASE 1 :: without sync block
	public static LazyRegistrywithThreading getNonSyncInstance() {

		if (NON_SYNC_INSTANCE == null) {
			NON_SYNC_INSTANCE = new LazyRegistrywithThreading();
		}

		return NON_SYNC_INSTANCE;
	}

	// CASE 2 :: without double check locking
	public static LazyRegistrywithThreading getDoubleChkInstance() {
		if (DBL_CHK_INSTANCE == null) {
			synchronized (LazyRegistrywithThreading.class) {
				DBL_CHK_INSTANCE = new LazyRegistrywithThreading();
			}
		}

		return DBL_CHK_INSTANCE;
	}

	// CASE 3 :: with double check locking(if condition) and Sync block BEST APPROACH
	public static LazyRegistrywithThreading getInstance() {
		if (INSTANCE == null) {
			synchronized (LazyRegistrywithThreading.class) {
				if (INSTANCE == null) {
					INSTANCE = new LazyRegistrywithThreading();
				}
			}
		}
		return INSTANCE;
	}

}
