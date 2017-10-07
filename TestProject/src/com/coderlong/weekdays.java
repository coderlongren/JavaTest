package com.coderlong;

import org.slf4j.instrumentation.ToStringHelper;

public abstract class weekdays {
	private weekdays() {

	}

	public final static weekdays SUN = new weekdays() {

		public weekdays nextday() {
			return MON;
		}

	};
	public final static weekdays MON = new weekdays() {

		public weekdays nextday() {
			return SUN;
		}
	};

	public abstract weekdays nextday();

	public String toString() {
		return this == SUN ? "SUN" : "MON";
	}

}
