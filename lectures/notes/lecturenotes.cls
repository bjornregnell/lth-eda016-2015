%https://sv.sharelatex.com/blog/2011/03/27/how-to-write-a-latex-class-file-and-design-your-own-cv.html

\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{lecturenotes}[2015/08/14 Lecture notes based on beamer]
\LoadClass{beamer}

\beamertemplatenavigationsymbolsempty
\usetheme{Antibes} \usecolortheme{default}
\usepackage{xcolor}

\usepackage[utf8]{inputenc}
\usepackage[T1]{fontenc}
%\usepackage{bera}
\usepackage[scaled=0.95]{beramono} % inconsolata or beramono ???
\usepackage{tgheros}
\usepackage{longtable}
\usepackage{booktabs}
\usepackage{multicol} \setlength{\columnsep}{5mm}
\usepackage{listings}
\usepackage{hyperref}
%http://tex.stackexchange.com/questions/50747/options-for-appearance-of-links-in-hyperref
\hypersetup{colorlinks=true,linkcolor=, linkbordercolor=, urlbordercolor=green!70!black, urlcolor=green!70!black, pdfborderstyle={/S/U/W 1}}

\newenvironment{Slide}[2][]
  {\begin{frame}[fragile,environment=Slide,#1]{#2}}
  {\end{frame}}
  
\newcommand{\Subsection}[1]{\subsection{#1}\frame{\centering\huge\bfseries\textcolor{blue}{#1}}}

\newlength\slidefontsize
\newcommand{\Size}[1]{\setlength\slidefontsize{#1}\fontsize{\slidefontsize}{1.25\slidefontsize}\selectfont}  

\newcommand{\SlideImg}[2]{\frame[plain]{\frametitle{#1}
\centering\includegraphics[width=1.0\textwidth]{#2}
}}
 

\definecolor{mygreen}{rgb}{0,0.6,0}
\definecolor{eclipsepurple}{rgb}{0.5,0,0.25}

\lstset{
    language=Java, 
    basicstyle=\ttfamily\scriptsize\selectfont,
    keywordstyle=\bfseries\color{eclipsepurple},
    commentstyle=\color{mygreen},
    numberstyle={\footnotesize},
    numbers=none,
    backgroundcolor=\color{gray!10},
    frame=single,
    tabsize=4,
    rulecolor=\color{black!20},
    %title={\footnotesize\lstname},
  breaklines=false,
  breakatwhitespace=false,
    framextopmargin=2pt,
    framexbottommargin=2pt,
    showstringspaces=false,
}
\lstset{literate=%
%swedish and german letters
{Å}{{\AA}}1
{Ä}{{\"A}}1
{Ö}{{\"O}}1
{Ü}{{\"U}}1
{ß}{{\ss}}1
{ü}{{\"u}}1
{å}{{\aa}}1
{ä}{{\"a}}1
{ö}{{\"o}}1
%danish letters
{æ}{{\ae}}1
{ø}{{\o}}1
{Æ}{{\AE}}1
{Ø}{{\O}}1
}

%http://tex.stackexchange.com/questions/203105/short-section-name-in-toc
%\usepackage{etoolbox}
%\makeatletter
% Insert [short title] for \section in ToC
%\patchcmd{\beamer@section}{{#2}{\the\c@page}}{{#1}{\the\c@page}}{}{}
% Insert [short title] for \section in Navigation
%\patchcmd{\beamer@section}{{\the\c@section}{\secname}}{{\the\c@section}{#1}}{}{}
% Insert [short title] for \subsection in ToC
%\patchcmd{\beamer@subsection}{{#2}{\the\c@page}}{{#1}{\the\c@page}}{}{}
% Insert [short title] for \subsection  in Navigation
%\patchcmd{\beamer@subsection}{{\the\c@subsection}{#2}}{{\the\c@subsection}{#1}}{}{}
%\makeatother