# simple reproduction of issue with S2699 (AssertionsInTestsCheck) in multi-module project

## Summary of bug

For the following test case an issue `Add at least one assertion to this test
case.` is reported if the assert target class is in a different module.

```java
// test case in maven module sub2
@Test
public void test()
{
  A1 a1 = null; // A1 comes from an other module (sub1)
  Assertions.assertThat(a1).isNull();
}
```

## How to

1. Start your Sonar : `docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube`
1. Remove all rules from default profile.
1. Add `Tests should include assertions` rule to default profile.
1. run `mvn sonar:sonar` on this project
1. Go to http://localhost:9000/project/issues?id=testsonar%3Aproject&resolved=false
and see that the same test `A1Test.java` doesn't have the same issues. In `sub1`
module, only 1 issue. In `sub2` module, 2 issues.
