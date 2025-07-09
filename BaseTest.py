import pytest

@pytest.mark.flasky(reruns=5)
@pytest.mark.userfixtures("log_no_failure","appium_driver")
class BaseTest:
    pass
