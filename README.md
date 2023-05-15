# ProductItem Android Library Demo in Jetpack Compose

## How To include it in your Android Projects 

#
#


### Step 1. Add the JitPack repository to your build file 
- Add it in your settings.gradle at root of your project: 
```gradle
 allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
### Step 2. Add the dependency
```gradle
dependencies {
	    implementation 'com.github.MuindiStephen:ProductItem:1.0.2'
}
```
## How to Implement it in your Compose UI
```kotlin
 ProductItem(
       image = painterResource(id = R.drawable.shoe),
       description = "Shoe",
       contentDescription = "shoe"
  )
```                    

> MIT License
```
MIT License

Copyright (c) 2023 MuindiStephen

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
