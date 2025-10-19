package pt.isec.literaturereviewhelper.controllers;

import org.junit.jupiter.api.Test;

class TestControllerTest {

	@Test
	void healthTest() {
        new TestController().health();
	}

}
