/* Test errors for constant strings.  */
/* { dg-do compile } */
/* { dg-options "-fgnu-runtime" } */

int foo()
{
  baz(@"hiya");  /* { dg-error "annot find interface declaration" } */
}

@interface NXConstantString
@end

int bar()
{
  baz(@"howdah");
}
