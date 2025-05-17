## Observer Pattern

The Observer Design Pattern is a behavioral design pattern where an object (called Subject) maintains a list of its dependents (called Observers) and notifies them automatically of any state changes.

This pattern is widely used in event handling systems, model-view-controller (MVC) architecture, and many real-time update scenarios.

### Real-world Analogy:
Think of YouTube subscriptions. A user (Observer) subscribes to a channel (Subject). When the channel uploads a new video, all subscribers are notified.

### Components:
- Subject – maintains list of observers and provides methods to add/remove/notify them.
- Observer – defines an interface to update when notified.
- ConcreteSubject – actual implementation with internal state changes.
- ConcreteObserver – receives and reacts to updates.
