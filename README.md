# Video Project Visitor

## 1. Project Description

This project demonstrates the Visitor design pattern in Java.

I created a simple video project system that contains video clips and audio tracks. I use the Visitor pattern to perform different operations on these elements without changing their classes.

## 2. Visitor Pattern Implementation

The project contains the following components:

- **VideoElement** — the Element interface with the `accept()` method.
- **VideoClip** — a concrete element representing a video clip.
- **AudioTrack** — a concrete element representing an audio track.
- **VideoVisitor** — the Visitor interface with methods for each element type.
- **DurationVisitor** — calculates the total duration of all media elements.
- **FileSizeVisitor** — calculates the total file size.
- **VideoProject** — stores the elements and allows visitors to traverse them.
- **Main** — demonstrates how the system works.

## 3. Double Dispatch

I use double dispatch through the `accept()` method.

For example, when a visitor visits a video clip, the `VideoClip` class calls:

`visitor.visitVideoClip(this);`

When it visits an audio track, the `AudioTrack` class calls:

`visitor.visitAudioTrack(this);`

This allows Java to select the correct visitor method without using `instanceof`.

## 4. Clean Code Principles

### 1. Meaningful Names

I use clear names such as `VideoClip`, `AudioTrack`, `DurationVisitor`, and `FileSizeVisitor`.

These names explain the responsibility of each class.

### 2. Single Responsibility Principle

Each class has one main responsibility.

For example, `DurationVisitor` calculates duration, while `FileSizeVisitor` calculates file size.

### 3. Open/Closed Principle

I can add a new visitor to perform another operation without modifying the existing element classes.

For example, I can add a visitor that generates a media information report.

### 4. Encapsulation

I keep the fields of `VideoClip` and `AudioTrack` private.

Visitors access the required information through public getter methods instead of directly accessing the fields.

This keeps the internal data protected while allowing visitors to perform their operations.

### 5. Avoiding Type Checking

I do not use `instanceof` or long if-else chains to identify element types.

Instead, I use double dispatch through the `accept()` method.

### 6. Separation of Concerns

I separate the media data from the operations performed on it.

The element classes store information, while visitor classes perform calculations.

## 5. Extensibility

I can add a third visitor without changing `VideoClip`, `AudioTrack`, or `VideoProject`.

For example, a `MediaInfoVisitor` could display information about each media element.

I would only need to create a new class implementing `VideoVisitor` and its required methods.

## 6. Example Output

```text
Video Project Report
--------------------
Total Duration: 320 seconds
Total File Size: 270 MB
```

## 7. Conclusion

I implemented the Visitor design pattern using Java.

This project helped me understand double dispatch and how to add new operations to an existing object structure without changing the element classes.