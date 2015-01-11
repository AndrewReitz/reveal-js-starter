# Reveal JS Starter

This project is to get you up and running with [reveal.js](//github.com/hakimel/reveal.js) quickly.

## Getting started

Requirements: Lazybones 0.7+

Install [lazybones](https://github.com/pledbrook/lazybones) using [gvm](//gvmtool.net/),
[jenv](//jenv.io/) or from [lazybones bintray](https://bintray.com/pledbrook/lazybones-templates/lazybones/view)

Edit/create `~/.lazybones/config.groovy` and add the following.

    bintrayRepositories = [
      "pieces/lazybones-templates",
      "pledbrook/lazybones-templates"
    ]

Run `lazybones list` to see all the available templates.
Run `lazybones create <template name> <template version> <target directory>` to create a new
Velcro project for example run `lazybones create reveal-js my-awesome-presentation`.

# License

    Copyright © 2015 Andrew Reitz aj.reitz@gmail.com
    This program is free software. It comes without any warranty, to
    the extent permitted by applicable law.
    You can redistribute it and/or modify it under the
    terms of the Do What The Fuck You Want To Public License, Version 2,
    as published by Sam Hocevar. See the COPYING file for more details.