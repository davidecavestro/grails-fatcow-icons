grails-fatcow-icons [![Build Status](https://travis-ci.org/davidecavestro/grails-fatcow-icons.png?branch=master)](https://travis-ci.org/davidecavestro/grails-fatcow-icons)
==================

A simple plugin that bundles the Fatcow Free icons set from http://www.fatcow.com/free-icons and provides some convenient taglibs to expose the icons as simple images or as potentially asynchronous clickable links.

# Icons
The icons themselves are located in the plugin's `web-app/images` directory, bundled exactly as they would be unzipped had you downloaded the zip file directly from [FATCOWICONS](http://http://www.fatcow.com/free-icons). The free bundle includes the free icons set at `16x16` and `32x32` size, located in `images/FatCow_Icons16x16` and `images/FatCow_Icons32x32` respectively.

## Designating An Icon
The plugin takes care of most of the excessive typing for you, allowing you to include ONLY the main part of the filename and not the extension. For example, the icon with the `/images/FatCow_Icons16x16/accept.png` path would require `iconName="accept"`.

## Size
The `size` merely controls the 'set' of icons you wish to use, currently only `16x16` and `32x32`. The [FATCOWICONS](http://http://www.fatcow.com/free-icons) release distributes the `16x16` set of icons and the `16x16` set of icons.

#Taglib
## fatcow:icon
Generates an `<img/>` tag that will load the icon on the page.

For example, the following will produce an <img/> tag on the page, loading the `16x16` `accept.png` icon:
    `<fatcow:icon iconName="accept"/>`

### iconName
The file name of the plugin without the .png extension. For example, `iconName="accept"` would load the resource from `/images/FatCow_Icons16x16/accept.png`.
### size
Currently either `16x16` or `32x32`. Size is optional and will default to `16x16`
### alt
Creates the HTML alt attribute in the `<img/>` tag. The taglib doesn't require this attribute, although HTML standard does. If you leave this blank, the plugin will place the `iconName` in there instead.
### width
Generates an HTML width attribute in the `<img/>` tag.
### height
Generates an HTML height attribute in the `<img/>` tag.

## fatcow:action
Uses an icon as a link to a remote uri that can be invoked via ajax. This tag is a thin wrapper above the `remoteLink` tag built into Grails. The attributes for the action tag are exactly the same as icon, adding all the attributes from `remoteLink`.

For example, the following will produce an async link using the `accept.png` icon, calling the `mycontroller/list` and updating the content element with the results:
```
<fatcow:action controller="mycontroller" action="list" update="content" iconName="accept" alt="Accept Icon" />
```

Given the action tag leverages the `remoteLink` tag, here are some examples taken from http://grails.org/doc/latest/ref/Tags/remoteLink.html redone for fatcow:

```<fatcow:action iconName="accept" alt="Accept Icon" action="show" id="1">Test 1</fatcow:action>

<fatcow:action iconName="accept" alt="Accept Icon" action="show" id="1"
update="[success:'success',failure:'error']" on404="alert('not found');">Test 2</fatcow:action>

<fatcow:action iconName="accept" alt="Accept Icon" action="show" id="1"
update="success" onLoading="showSpinner();">Test 3</fatcow:action>

<fatcow:action iconName="accept" alt="Accept Icon" action="show" id="1"
update="success" params="[sortBy:'name',offset:offset]">Test 4</fatcow:action>

<fatcow:action iconName="accept" alt="Accept Icon" action="show" id="1"
update="success" before="if(!confirm('Are you sure?')) return false">Test 5</fatcow:action>
```

# Credits

This plugin includes image icons created at [FATCOW](http://www.fatcow.com).
Also, it is heavily based on the work done by the authors of [grails-glyph-icons](http://github.com/ericbuitenhuis/grails-glyph-icons)... even this document started as a copy and paste of the grails-glyph-icons README :-)
