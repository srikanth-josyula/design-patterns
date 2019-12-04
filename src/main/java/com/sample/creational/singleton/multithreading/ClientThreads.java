package com.sample.creational.singleton.multithreading;

/**
 * If you run this code many times, you will see sometimes both the threads
 * creates different instances.
 * 
 * @author SriKanth
 *
 */
public class ClientThreads {
	public static void main(String[] args) {
		// Thread 1
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				LazyRegistrywithThreading inc = LazyRegistrywithThreading.getInstance();
				System.out.println("Instance 1 With Sync Block :" + inc.hashCode());
				LazyRegistrywithThreading nonSyncinc = LazyRegistrywithThreading.getNonSyncInstance();
				System.out.println("Instance 1 WithOut Sync Block ::" + nonSyncinc.hashCode());
				LazyRegistrywithThreading nondblChkinc = LazyRegistrywithThreading.getDoubleChkInstance();
				System.out.println("Instance 1 With Sync Block and WithOut Double Check ::" + nondblChkinc.hashCode());
			}
		});

		// Thread 2
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				LazyRegistrywithThreading inc1 = LazyRegistrywithThreading.getInstance();
				System.out.println("Instance 2 With Sync Block :" + inc1.hashCode());
				LazyRegistrywithThreading nonSyncinc1 = LazyRegistrywithThreading.getNonSyncInstance();
				System.out.println("Instance 2 WithOut Sync Block ::" + nonSyncinc1.hashCode());
				LazyRegistrywithThreading nondblChkinc1 = LazyRegistrywithThreading.getDoubleChkInstance();
				System.out.println("Instance 2 With Sync Block and WithOut Double Check ::" + nondblChkinc1.hashCode());
			}
		});

		// start both the threads
		t1.start();
		t2.start();
	}

}
