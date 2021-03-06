package org.glydar.paraglydar.events.manager;

import org.glydar.paraglydar.event.Cancellable;
import org.glydar.paraglydar.event.Event;

public class HelpersEvent {

	public static class DummyEvent extends Event {
	}

	public static class SubEvent extends DummyEvent {
	}

	public static class CancellableEvent extends Event implements Cancellable {

		private boolean cancelled = false;

		@Override
		public boolean isCancelled() {
			return cancelled;
		}

		public void setCancelled(boolean cancelled) {
			this.cancelled = cancelled;
		}
	}
}
