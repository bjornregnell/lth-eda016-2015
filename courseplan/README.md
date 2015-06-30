# How to build course plan of EDA016 #

The file `body.md` includes markdown text of the body of the coursplan.

Run this in a Linux terminal with `pandoc` and `pdflatex` on your path:

```bash
source build.sh
```

This will create a [pdf](https://github.com/bjornregnell/lth-eda016-2015/blob/master/courseplan/courseplan.pdf) with the course plan from `courseplan.tex` that includes `generated-body.tex` which is generated from `body.md`. This build process is dependent on the build of `../weekplan/build.sh` and the `../weekplan/weekplan.tex` file in this repo.
