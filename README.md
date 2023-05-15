# ProductItem Android Library Demo in Jetpack Compose

## How To include it in your Android Projects 

#
#


### Step 1. Add the JitPack repository to your build file 
- Add it in your settings.gradle at root of your project: 
```
 allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
### Step 2. Add the dependency
```
dependencies {
	    implementation 'com.github.MuindiStephen:ProductItem:1.0.2'
}
```
## How to Implement it in your Compose UI
```
 ProductItem(
       image = painterResource(id = R.drawable.shoe),
       description = "Shoe",
       contentDescription = "shoe"
  )
```                    

> license
